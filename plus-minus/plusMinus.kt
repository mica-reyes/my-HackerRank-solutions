fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    var positive= 0F
    var negative= 0F
    var zero= 0F
    arr.forEach{
    if(it>0){positive++}
    else if( it<0){negative++}
    else{zero++}
    }
    println(String.format("%6f", positive/arr.size))
    println(String.format("%6f", negative/arr.size))
    println(String.format("%6f", zero/arr.size))
}

//Time Complexity: O(N)