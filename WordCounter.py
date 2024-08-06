sentance="This is a common interview question"
#creating empty dictionary
my_dict={}

#Extracting character from sentance and updating the repeating
for char in sentance.lower():
    if(not char==" "):
        if(char in my_dict):
            my_dict[char] +=1
        else:
            my_dict[char]=1

#sorting my value
my_sorted_chars=sorted(my_dict.items(), key=lambda kv:kv[1],reverse=True)
#assinging the
most_repeated_char, highest_count=my_sorted_chars[0]
print(most_repeated_char,highest_count)


