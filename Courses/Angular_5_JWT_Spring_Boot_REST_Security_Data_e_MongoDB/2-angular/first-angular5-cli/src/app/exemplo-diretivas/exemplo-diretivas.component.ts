import { TaskListComponent } from './../task-list/task-list.component';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-exemplo-diretivas',
  templateUrl: './exemplo-diretivas.component.html',
  styleUrls: ['./exemplo-diretivas.component.css']
})
export class ExemploDiretivasComponent {
  isAdmin: boolean = false;
  profile: number = 2;

}
