#include <iostream>
using namespace std;

int main()
{
	int a, b;
	int c, d, e, f, g;

	cin >> a >> b;
	cin >> c >> d >> e >> f >> g;

	int k = a * b;

	cout << c - k  << ' ' << d - k << ' ' << e - k
		<< ' ' << f - k << ' ' << g - k;
}