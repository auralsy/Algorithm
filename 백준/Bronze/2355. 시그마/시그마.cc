#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
	long long a, b;
	long long s = 0;
	
	cin >> a >> b;

	if (a > b)
		swap(a, b);
	cout << (b-a+1)*(b+a)/2;
}