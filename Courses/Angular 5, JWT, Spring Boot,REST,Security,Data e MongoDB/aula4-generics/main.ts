import { Person } from './../aula2-classes/person';
import { GenericDao } from './dao';

let genericDaoTest = new GenericDao<Person>();

let p = new Person('Rogério');

genericDaoTest.insert(p);