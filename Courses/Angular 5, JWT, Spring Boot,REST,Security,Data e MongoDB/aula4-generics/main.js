"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var person_1 = require("./../aula2-classes/person");
var dao_1 = require("./dao");
var genericDaoTest = new dao_1.GenericDao();
var p = new person_1.Person('Rogério');
genericDaoTest.insert(p);
//# sourceMappingURL=main.js.map