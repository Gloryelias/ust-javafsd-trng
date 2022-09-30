var global_num = 12;
var Number1 = /** @class */ (function () {
    function Number1() {
        this.num_val = 13;
    }
    Number1.prototype.storeNum = function () {
        var local_num = 14;
    };
    Number1.sval = 10;
    return Number1;
}());
console.log("Global num:" + global_num);
console.log(Number1.sval);
var obj = new Number1();
console.log("Global num:" + obj.num_val);
