let a = 153;
let c=a;
s=0;
r=0;
while(a>0){
    r=a%10;
    s=(r*r*r)+s;
    a=a/10;
    console.log(s);   
}
if(c==s){
    console.log("yes");
    
} else{
    console.log("no");
    
}