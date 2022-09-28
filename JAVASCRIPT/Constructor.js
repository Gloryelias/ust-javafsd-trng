class Student{
    constructor(name,age)
    {
        this.n=name;
        this.a=age;
    }
        stu()
        {
            console.log("The Name of the Student is:",this.n)
            console.log("The Age of the Student is:",this.a)

        }
    }
var stuObj=new Student('Peter',20)
stuObj.stu()
