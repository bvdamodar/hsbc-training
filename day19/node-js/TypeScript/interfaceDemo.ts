// Interface for Employee
interface IEmployee{ 
    empId:Number;
    name:String;
    city:String;
    salary:Number;
} 

//Creating an emp using Interface
var emp:IEmployee={empId:101,name:"Dam",city:'Vizag',salary:50000.0};

// var empList:IEmployee[]

//Printing the emp in console
console.log("Employee: "+emp.empId+" "+emp.name+" "+emp.city+" "+emp.salary);