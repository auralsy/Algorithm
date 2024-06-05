#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
	int kang[3];
	int a, b, c;
	cin >> a >> b >> c;
	kang[0] = a, kang[1] = b, kang[2] = c;

	int co = 0;
	while (1)
	{
		if (kang[0] == kang[1] || kang[1] == kang[2] || kang[0] == kang[2])
			break;
		if (kang[1] - kang[0] > kang[2] - kang[1])
		{
			kang[2] = kang[1] - 1;
		}
		else if (kang[1] - kang[0] <= kang[2] - kang[1])
		{
			kang[0] = kang[1] + 1;
		}
		co++;
		sort(begin(kang), end(kang));
	}

	cout << co - 1;

	return 0;
}