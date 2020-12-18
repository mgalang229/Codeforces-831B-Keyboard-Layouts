#include <bits/stdc++.h>
using namespace std;

#define ll long long

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	string s1, s2, s3;
	cin >> s1 >> s2 >> s3;
	string tmp="";
	for(int i=0; i<(int)s3.size(); ++i) {
		if(s3[i]-'0'>=0&&s3[i]-'0'<=9)
			tmp+=s3[i];
		for(int j=0; j<(int)s1.size(); ++j)
			if(tolower(s3[i])==s1[j]) {
				if(isupper(s3[i]))
					tmp+=toupper(s2[j]);
				else
					tmp+=s2[j];
			}
	}
	cout << tmp << "\n";
}
