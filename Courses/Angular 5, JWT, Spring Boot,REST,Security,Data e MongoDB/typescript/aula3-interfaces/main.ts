import { Person } from './../aula2-classes/person';
import { PersonDao } from './person-dao';
import { DaoInterface } from './dao.interface';


let personDao: DaoInterface = new PersonDao();
let person = new Person('John');

personDao.insert(person);