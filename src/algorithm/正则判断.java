package algorithm;

/**
 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。 在本题中，
 * 匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 * @author ZhouHao
 * @since 2019年4月3日
 */

public class 正则判断 {
    public boolean matchTwo(char[] str, char[] pattern, int sI, int pI){
        if(sI >= str.length && pI >= pattern.length)    return true;
        else if(pI >= pattern.length)    return false;
        else if(sI >= str.length && pI == pattern.length-1 && pattern[pI] != '*') return false;
        else if(sI >= str.length && pI == pattern.length-2 && pattern[pI+1] != '*') return false;
        
        if(sI >= str.length)    return matchTwo(str, pattern, sI, pI + 2);
        
        if(pattern[pI] == '*'){
            if(pattern[pI-1] == '.' || str[sI] == pattern[pI-1])
                return matchTwo(str, pattern, sI + 1, pI) || 
                        matchTwo(str, pattern, sI + 1, pI + 1) ||
                        matchTwo(str, pattern, sI, pI + 1);
            else return matchTwo(str, pattern, sI, pI + 1);
        } else if(pattern[pI] == str[sI] || pattern[pI] == '.'){
            if(pI < pattern.length - 1 && pattern[pI + 1] == '*')
                return matchTwo(str, pattern, sI, pI + 1);
            else return matchTwo(str, pattern, sI + 1, pI + 1);
        } else if(pI + 1 < pattern.length && pattern[pI + 1] == '*'){
            return matchTwo(str, pattern, sI, pI + 2);
        } else return false;
    }
    
    public boolean match(char[] str, char[] pattern)
    {
        int i=0, j=0, k=0;
        char c = ' ';
        if(str.length==0){
            if(pattern.length==0)    return true;
            for(char ch : pattern)    if(ch=='*')    return true;
            return false;
        }
        return matchTwo(str, pattern, 0, 0);
    }
}
