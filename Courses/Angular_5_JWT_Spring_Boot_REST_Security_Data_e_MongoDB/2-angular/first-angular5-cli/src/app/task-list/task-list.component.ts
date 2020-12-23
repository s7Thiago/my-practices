import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrls: ['./task-list.component.css']
})
export class TaskListComponent {
  tasks = [];
  task = ""; // Representa o valor do campo de texto
  isAdmin = true;
  isAddingEmptyValue = false;
  typeSomethingMessage = 'Type something!!!';

  // Clique do botão de adicionar tarefa (task)
  add(): void {
    this.tasks.reverse;
    if (this.task != "") {
      this.isAddingEmptyValue = false;

      this.task == this.typeSomethingMessage ? null :
        this.tasks.push(this.task);

      this.task != this.typeSomethingMessage ?
        this.task = ""
        : null;

      this.task == this.typeSomethingMessage ?
        this.isAddingEmptyValue = true
        : null;

    } else {
      this.task = this.typeSomethingMessage
      this.isAddingEmptyValue = true;
    }

  }
}
