func solution(num1 int, num2 int) int {
    var (
        i float32
        j float32
        answer int
    )
    
    i = float32(num1)
    j = float32(num2)
    
    answer = int(( i / j ) * 1000)
    
    return answer
}