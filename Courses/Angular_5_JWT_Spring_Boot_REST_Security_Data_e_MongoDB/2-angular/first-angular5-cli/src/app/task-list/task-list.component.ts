import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrls: ['./task-list.component.css']
})
export class TaskListComponent {
  title = 'Tasks';
  tasks = [];
  task = ""; // Representa o valor do campo de texto

  // Clique do botão de adicionar tarefa (task)
  add(): void {
    if (this.task != "") {
      console.log("Add foi acionado!");
      this.tasks.push(this.task);
      this.task = "";
    }
  }
}
