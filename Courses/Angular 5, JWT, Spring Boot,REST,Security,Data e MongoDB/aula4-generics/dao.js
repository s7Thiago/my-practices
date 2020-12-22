"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.GenericDao = void 0;
var GenericDao = /** @class */ (function () {
    function GenericDao() {
    }
    GenericDao.prototype.insert = function (_object) {
        console.log("Inserting a generic...");
        return true;
    };
    GenericDao.prototype.update = function (_object) {
        console.log("Updating a generic...");
        return true;
    };
    GenericDao.prototype.delete = function (_id) {
        console.log("Deleting a generic...");
        return true;
    };
    GenericDao.prototype.find = function (_id) {
        console.log("Finding a generic...");
        return null;
    };
    GenericDao.prototype.findAll = function () {
        console.log("Finding all with generic way...");
        return [null];
    };
    return GenericDao;
}());
exports.GenericDao = GenericDao;
//# sourceMappingURL=dao.js.map