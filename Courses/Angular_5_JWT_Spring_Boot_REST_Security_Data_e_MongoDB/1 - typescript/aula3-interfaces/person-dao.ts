import { Person } from './../aula2-classes/person';
import { DaoInterface } from './dao.interface';

export class PersonDao implements DaoInterface {
    tableName: string;

    insert(person: Person): boolean {
        console.log(`Inserting ${person.toString()}...`);

        return true;
    }
    update(object: any): boolean {
        return true;
    }
    delete(id: number): boolean {
        return true;
    }
    find(id: number) {
        return null;
    }
    findAll(): [any] {
        return [new Person('Bernardo')];
    }

}