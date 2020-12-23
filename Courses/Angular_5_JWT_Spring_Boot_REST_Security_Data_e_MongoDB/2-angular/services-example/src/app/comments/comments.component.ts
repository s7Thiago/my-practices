import { CommentService } from './comment.service';
import { Component, OnInit } from '@angular/core';
import { Comment } from './comment.model';

@Component({
  selector: 'app-comments',
  templateUrl: './comments.component.html',
  styleUrls: ['./comments.component.css']
})
export class CommentsComponent implements OnInit {

  comments: Comment[]; // Lista que será populada a partir do serviço

  constructor(private commentsService: CommentService) {

  }

  ngOnInit() {
    this.commentsService.getComments()
      .subscribe(itens => this.comments = itens) // É nesse momento que a requisição é acionada
  }

}
