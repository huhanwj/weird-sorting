# from https://en.wikipedia.org/wiki/Bead_sort
# need understand it
def beadSort(l):
    b=[]
    l_len=len(l)-1
    index=0
    count=0
    while(any(l)):
        if l[index]!=0:
            count+=1
            l[index]-=1
        if index==l_len:
            b.append(count)
            index=0
            count=0
        else:
            index+=1
    if count!=0:
        b.append(count)
    result=[]
    for i,v in enumerate(b[:-1]):
        if v==b[i+1]:
            continue
        else:
            result.extend([i+1 for _ in range(v-b[i+1])])
    result.extend([len(b) for _ in range(max(b)-len(result))])
    return result
if __name__ =="__main__":
    print(beadSort([2,4,1,5,1,3,1,32,12,41,31,4,1,313,12,1,31,3,13,14]))
    
