// function declaration
// f1()//hoisting 
// function f1(){  // no arg functions
//     console.log('hello world');  
// }

// f1(); //calling a function --function caller
// f1();
// f1();
// function f2(name){ // arg function
//     console.log(`my name is ${name}`);

// }
// f2(); //my name is undefined
// f2('radha');//my name is radha
// f2('bhaskar');//my name is bhaskar




// function expression
// let f1=function(){
//     console.log("function expression");

// }
// f1();



// arrow function or shorter syntax for function
// let f3=()=>{
//   console.log("arrow function");

// }
// f3();

// //Anonymous Function
// setTimeout(f1(), 5000);

// setTimeout(() => {
//     console.log("anonymous function");
// }, timeout);


// call back functions

// function isSuccess(){
//     console.log("authentication success");

// }
// function isFailure(){
//     console.log("login failed");

// }
// function isAuthenticate(userName ,password , success, failure){
//     if(userName=='user'&& password=='user@123'){
//           success(); 
//     }else{
//           failure();
//     }
// }

// isAuthenticate('admin','user@123',isSuccess,isFailure);


// constructor function -- uesd to create objects
//  function Student(name,email,phone,rollNum){
//      this.name=name;
//      this.email=email;
//      this.phone=phone;
//      this.rollNumber=rollNum;
//  }

//  let s1=new Student('Raja','raj@gmail.com',6545534,101);
//  let s2=new Student('Rani','rani@gmail.com',434567,102);
//  console.log(s1);
//  console.log(s2);





// IIFE - immediately invoked function expression
//   (
//      function(){
//       console.log("IIFE");

//     }
//   )();


//    (
//      function(name){
//       console.log("IIFE",name);

//     }
//   )('xyz');



// Generator Function

// function* generator() {
//       yield 'hello';
//       yield 'students';
//       yield  'bye';
//       yield  'bye students';
// }

// let g=generator();
// console.log(g);

// console.log(g.next());
// console.log(g.next());
// console.log(g.next());
// console.log(g.next());
// console.log(g.next());//{data , value}


// // ExcelR
// function* excelrGenerator(){
//     let value=1;
//     while(value<=50){
//     yield `ExcelR_00${value}`
//     value++;
//    }
// }
// let g2=excelrGenerator();
// let num=1;
// while(num<=50){
// console.log(g2.next().value);
// num++;
// }



// function f1(){
//     console.log('hello world');
    
// }
// f1(); // function caller
// // console.log(f1());

// function f2(){
//     return 'function returns value'
// }
// // f2(); // no output
// let result=f2();
// console.log(result);






//higher order function

function calculator(a,b,operation){
 return operation(a,b);
}


function add(a,b){
    return a+b;
}
function sub(a,b){
    return a-b;
}

console.log(calculator(10,20,add)); //30
console.log(calculator(30,20,sub)); //10





