import { User } from './user';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Tasks App';

  // Usadas para ilustrar o uso de pipes para formatar
  // saídas no a partir do HTML
  upperText: string = 'Display a upper case text';
  lowerText: string = 'Display a lower case text';
  percentValue: number = .5;
  date: Date = new Date();
  money: number = 1436.65;

  user: User = {
    name: 'Mario',
    age: 22
  };
}
