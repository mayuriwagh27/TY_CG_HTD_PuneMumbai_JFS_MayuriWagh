let myname: String = 'Mayuri';  //String
//myname = 123;     => cannot change data type

//any
let company; 
company = 123;
company = "Mayuri";    //can change data type
company = true;

//union
let age : String | number;     // can use multiple data types
age = 12;
age = 'twelve';
//age = true;    =>  only string or number coz age is decleared as string n number

let age1 : String | number | boolean;
age1 = 'eleven';
age1 = 12;
age1 = true; 

//tuple
let details : [string, number, number ] = ['mayuri',23,15];

//array
//let mobiles:String[] = ['iphone', 'samsung', 552, true,];  =>array decleared as string
let mobiles = ['iphone', 'samsung', 552, true] ;  //will not show error coz no data type is decleared8

//functions
function add(a:number ,b:number):number{
return a+b;    //in return can only write number coz decleared as number, if we write other then shows error
}










