func solution(n int) []int {
    var arr []int
    for i :=1; i<=n; i++ {
        if i % 2 == 1 {
            arr = append(arr,i)
        }
    }
    
    return arr
}