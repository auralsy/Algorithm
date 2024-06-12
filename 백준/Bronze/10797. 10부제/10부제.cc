#include <iostream>
using namespace std;

int main()
{
	int a,b,c,d,e,f;
	cin >> a;

	cin >> b >> c >> d >> e >> f;

	int k = 0;

	if (a == b)
		k = k + 1;

	if (a == c)
		k = k + 1;

	if (a == d)
		k = k + 1;

	if (a == e)
		k = k + 1;

	if (a == f)
		k = k + 1;

	cout << k;
}