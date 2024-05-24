#include <iostream>
using namespace std;

int main()
{
    int a, b, c;
    
    cin >> a >> b;
    cin >> c;
    
    if((a + b) >= 2*c)
    {
        cout << (a+b) - 2*c;
    }
    else if(a + b < 2*c)
    {
        cout << a+b;
    }
}