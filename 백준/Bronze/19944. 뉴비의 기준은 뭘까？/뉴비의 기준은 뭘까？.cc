#include <iostream>
using namespace std;

int main()
{
	//뉴비 -> 1,2학년 / 올드비 -> n학년 이하이면서 뉴비 아님
	//tle -> 뉴비도 올드비도 아닌 사람

	int n, m;

	cin >> n >> m;

	if (m <= 2)
		cout << "NEWBIE!";
	else if ((2 < m) && (m<= n))
		cout << "OLDBIE!";
	else if (m > n)
		cout << "TLE!";
}