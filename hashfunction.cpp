#include <iostream>
#include <string>

#include "cryptlib.h"
#include "filters.h"
#include "hex.h"
#include "md5.h"
#include "sha.h"

using namespace std;
using namespace CryptoPP;

// Function to compute hash
string hashFunction(string input, HashTransformation& hash) {
    string digest;

    StringSource s(input, true,
        new HashFilter(hash,
            new HexEncoder(
                new StringSink(digest)
            )
        )
    );

    return digest;
}

int main() {
    string message;
    cout << "Enter message: ";
    getline(cin, message);

    // MD5
    MD5 md5;
    string md5_hash = hashFunction(message, md5);
    cout << "MD5: " << md5_hash << endl;

    // SHA-1
    SHA1 sha1;
    string sha1_hash = hashFunction(message, sha1);
    cout << "SHA-1: " << sha1_hash << endl;

    // SHA-256
    SHA256 sha256;
    string sha256_hash = hashFunction(message, sha256);
    cout << "SHA-256: " << sha256_hash << endl;

    return 0;
}
