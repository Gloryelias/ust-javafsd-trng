function addNumbers(...nums:number[]){
   
    var sum=0;

    for(var i=0;i<nums.length;i++){
        sum=sum+nums[i];
    }
    console.log("sum of the numbers",sum)
}
addNumbers(1,2,3)
addNumbers(10,10,10,10,10,10)