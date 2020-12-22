"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.PersonDao = void 0;
var person_1 = require("./../aula2-classes/person");
var PersonDao = /** @class */ (function () {
    function PersonDao() {
    }
    PersonDao.prototype.insert = function (person) {
        console.log("Inserting " + person.toString() + "...");
        return true;
    };
    PersonDao.prototype.update = function (object) {
        return true;
    };
    PersonDao.prototype.delete = function (id) {
        return true;
    };
    PersonDao.prototype.find = function (id) {
        return null;
    };
    PersonDao.prototype.findAll = function () {
        return [new person_1.Person('Bernardo')];
    };
    return PersonDao;
}());
exports.PersonDao = PersonDao;
//# sourceMappingURL=person-dao.js.map