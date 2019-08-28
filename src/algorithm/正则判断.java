package algorithm;

/**
 * ��ʵ��һ����������ƥ�����'.'��'*'��������ʽ��ģʽ�е��ַ�'.'��ʾ����һ���ַ�����'*'��ʾ��ǰ����ַ����Գ�������Σ�����0�Σ��� �ڱ����У�
 * ƥ����ָ�ַ����������ַ�ƥ������ģʽ�����磬�ַ���"aaa"��ģʽ"a.a"��"ab*ac*a"ƥ�䣬������"aa.a"��"ab*a"����ƥ��
 * @author ZhouHao
 * @since 2019��4��3��
 */

public class �����ж� {
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
