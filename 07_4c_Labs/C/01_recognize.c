#include <stdio.h>
#include <string.h>
#include <stdlib.h>
void main()
{
    char s[20], c, flag = 0;
    int state = 0, i = 0;
    printf("\n Enter a string:");
    scanf("%s", s);
    int l = strlen(s);
    if (s[0] == 'a' && s[1] == 'b')
    {
        if (s[2] == 'b')
            printf("\n %s is accepted under rule 'abb'", s);
        else
            printf("\n %s is not recognised.", s);
    }
    else if (s[l - 1] == 'b' && s[l - 2] == 'b')
    {
        if (s[l - 3] == 'a')
            printf("\n %s is accepted under rule 'abb'", s);
        else
            printf("\n %s is not recognised.", s);
    }
    else
    {
        while (s[i] != '\0')
        {
            switch (state)
            {
            case 0:
                c = s[i++];
                if (c == 'a')
                    state = 1;
                else if (c == 'b')
                    state = 2;
                else
                    state = 6;
                break;
            case 1:
                c = s[i++];
                if (c == 'a')
                    state = 3;
                else if (c == 'b')
                    state = 4;
                else
                    state = 6;
                break;
            case 2:
                c = s[i++];
                if (c == 'a')
                    state = 6;
                else if (c == 'b')
                    state = 2;
                else
                    state = 6;
                break;
            case 3:
                c = s[i++];
                if (c == 'a')
                    state = 3;
                else if (c == 'b')
                    state = 2;
                else
                    state = 6;
                break;
            case 4:
                c = s[i++];
                if (c == 'a')
                    state = 6;
                else if (c == 'b')
                    state = 5;
                else
                    state = 6;
                break;
            case 5:
                c = s[i++];
                if (c == 'a')
                    state = 6;
                else if (c == 'b')
                    state = 2;
                else
                    state = 6;
                break;
            case 6:
                flag = 1;
                printf("\n %s is not recognised.", s);
            }
            if (flag)
                break;
        }
        if (state == 1)
            printf("\n %s is accepted under rule 'a'", s);
        else if ((state == 2) || (state == 4))
            printf("\n %s is accepted under rule 'a*b+'", s);
        else if (state == 5)
            printf("\n %s is accepted under rule 'abb'", s);
    }
}