#include <iostream>
using namespace std;

int main()
{
	int a, b, c, d;
	int e, f, g, h;

	cin >> a >> b >> c >> d;
	cin >> e >> f >> g >> h;

	int s = a + b + c + d;
	int t = e + f + g + h;

	if (s > t)
		cout << s;
	else if (s < t)
		cout << t;
	else
		cout << s;
}