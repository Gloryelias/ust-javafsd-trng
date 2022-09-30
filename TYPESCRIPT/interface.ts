interface IPerson
{
    firstName:string,lastName:String,sayHi:()=>String
}

var customer:IPerson={firstName:"Tom",lastName:"Hanks",sayHi:():String=>{return "Hi there"}
}

console.log("Customer Object")
console.log(customer.firstName)
console.log(customer.lastName)
console.log(customer.sayHi())

var employee:IPerson={
    firstName:"Jim",
    lastName:"Blakes",
    sayHi:():string=>{return "Hello!!!"}
}

console.log("Employee Object");
console.log("employee.firstName");
console.log("employee.lastName");

