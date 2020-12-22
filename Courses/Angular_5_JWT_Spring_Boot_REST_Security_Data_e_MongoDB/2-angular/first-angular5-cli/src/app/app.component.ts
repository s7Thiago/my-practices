import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
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
