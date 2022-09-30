class Car
{
     engine:string;


constructor(engine:string)
{
     this.engine=engine
}

disp():void{
    console.log("Function display Engine is :" +this.engine)
   }
}

var obj1=new Car("XXSY1")
console.log("Reading attribute value Engine as: "+obj1.engine)