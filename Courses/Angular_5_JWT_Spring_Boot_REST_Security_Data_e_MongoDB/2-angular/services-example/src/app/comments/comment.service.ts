import { Comment } from './comment.model';
import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import { Observable } from 'rxjs/Observable';

import 'rxjs/add/operator/map';

@Injectable()
export class CommentService {

  constructor(private http: Http) { }

  getComments(): Observable<Comment[]> {
    return this.http.get('https://jsonplaceholder.typicode.com/comments')
      .map(response => response.json());
  }

}
