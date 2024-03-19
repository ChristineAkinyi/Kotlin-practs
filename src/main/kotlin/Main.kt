fun main() {
    addNumbers(24,34)
    addArrayIntegers(arrayOf(2,5,7,9))
    checkLen(arrayOf("Kenya", "Rwanda", "Uganda", "Ethiopia", "Malawi"))
    countVowels("Otieno")
    reverseStr("Lunch")

}

fun addNumbers(num1:Int, num2:Int): Int{
    var result = num1 + num2
    return result
}

fun addArrayIntegers(nums:Array<Int>):Int{
    var nums = arrayOf(2,5,7,9)
    var sum = nums[0] + nums[1] +nums[2] + nums[3]
    return sum
}

fun checkLen(text:Array<String>):Int{
    var text = arrayOf("Kenya", "Rwanda", "Uganda", "Ethiopia", "Malawi")
    var maxLength = 0
    for (x in text) {
        if (x.length > maxLength) {
            maxLength = x.length
        }
    }
    return maxLength
}

fun countVowels(word:String):Int{
    var vowels = listOf<Char>('a', 'e', 'i', 'o', 'u')
    var vowelCount = 0
    for (v in word){
        if(v in vowels){
            vowelCount++
        }
    }
    return vowelCount
}

fun reverseStr(input:String):String{
    var newStr = input.reversed()
    return newStr

}

