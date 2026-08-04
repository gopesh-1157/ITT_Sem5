class Solution:
    def largestNumber(self, nums: list[int]) -> str:
        arr = list(map(str, nums))
        
        arr.sort(key=lambda a: a * 10, reverse=True)
        
        if arr[0] == '0':
            return '0'
            
        return ''.join(arr)
