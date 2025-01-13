func solution(numbers []int) []int {
    leng := len(numbers) 
    var arr []int
    
    for i := 0; i<leng; i++ {
        arr = append(arr,numbers[i] * 2)
    }
    
    return arr
}