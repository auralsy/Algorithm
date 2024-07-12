#include <iostream>
using namespace std;

int main()
{
	int a, b, c, d, e, f, g, h, i, j, k, l;

	cin >> a >> b >> c >> d;
	cin >> e >> f >> g >> h;
	cin >> i >> j >> k >> l;

	int sum1, sum2, sum3;

	sum1 = a + b + c + d;
	sum2 = e + f + g + h;
	sum3 = i + j + k + l;

	if (sum1 == 3)
		cout << "A" << '\n';
	else if (sum1 == 2)
		cout << "B" << '\n';
	else if (sum1 == 1)
		cout << "C" << '\n';
	else if (sum1 == 0)
		cout << "D" << '\n';
	else
		cout << "E" << '\n';

	if (sum2 == 3)
		cout << "A" << '\n';
	else if (sum2 == 2)
		cout << "B" << '\n';
	else if (sum2 == 1)
		cout << "C" << '\n';
	else if (sum2 == 0)
		cout << "D" << '\n';
	else
		cout << "E" << '\n';

	if (sum3 == 3)
		cout << "A";
	else if (sum3 == 2)
		cout << "B";
	else if (sum3 == 1)
		cout << "C";
	else if (sum3 == 0)
		cout << "D";
	else
		cout << "E";
}