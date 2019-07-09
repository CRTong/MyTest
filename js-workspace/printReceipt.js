function isBarcodesExist(databaseID,barcode){
    return databaseID == barcode;
}

function createReceipt(database,barcodes){
    var receipt = 'Receipts\n------------------------------------------------------------\n';
    var finalprice = 0;
    var tempCount = []; 
    var flag = 0;

    for(let i = 0;i < barcodes.length;i++){
        tempCount[i] = 0;
        for(let j = 0;j < database.length;j++){
            if(isBarcodesExist(database[j].id, barcodes[i])){
                tempCount[i]++;
                flag++;
            }
        }
    }

    if(flag == 0){
        receipt += "Error:all barcodes is not exist\n------------------------------------------------------------\n";
    }else{
        for(let i = 0;i < barcodes.length;i++){
            for(let j = 0;j < database.length;j++){
                if(isBarcodesExist(database[j].id, barcodes[i])){
                     receipt += (database[j].name + '\t' + database[j].price + "\t" + tempCount[i] +'\n');
                     finalprice += database[j].price;
                }
            }
         }
         receipt += ("------------------------------------------------------------\nprice:" + finalprice);
    }

    return receipt;
}
    
module.exports = {
    createReceipt,
}