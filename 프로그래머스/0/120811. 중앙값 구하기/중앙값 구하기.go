import (
    "sort"
)

func solution(array []int) int {
    sort.Ints(array)
    leng := len(array)
    center := leng / 2
    
    return array[center]
}