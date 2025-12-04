s = "ababa"
result = []
for length in range(len(s), 0, -1):
    for start in range(0, len(s) - length + 1):
        result.append(s[start:start+length])