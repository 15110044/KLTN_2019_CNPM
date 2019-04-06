/**
 * 
 */

    var cook;
    var carts = [];
 
    var i;
    var txt;
    function cart(productId)
    {
    	carts.push(productId);
    	document.getElementById("total_items").innerHTML = carts.length;
//    	document.getElementById("carts").value = carts;
    	for (i =0 ; i< carts.length; i++){
    		txt+= "carts="+carts[i]+"&"
    	}
    	document.getElementById("btnCart").href="/FindFood/showCart?"+txt
    	
    	
    }



