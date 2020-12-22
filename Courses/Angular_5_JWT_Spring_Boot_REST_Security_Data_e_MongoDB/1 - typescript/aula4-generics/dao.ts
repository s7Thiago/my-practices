import { GenericDaoInterface } from './generic.dao.interface';

export class GenericDao<T> implements GenericDaoInterface<T> {
    tableName: string;

    insert(_object: T): boolean {
        console.log(`Inserting a generic...`);

        return true;
    }
    update(_object: T): boolean {
        console.log(`Updating a generic...`);
        return true;
    }
    delete(_id: number): boolean {
        console.log(`Deleting a generic...`);
        return true;
    }
    find(_id: number): T {
        console.log(`Finding a generic...`);
        return null;
    }
    findAll(): [T] {
        console.log(`Finding all with generic way...`);
        return [null];
    }

}