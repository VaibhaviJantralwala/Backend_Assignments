import React, { useState } from 'react'

const CartItem = () => {

    const [quantity, setQuantity] = useState(1);

  return (
    <div>
      <h3>Shopping cart</h3>
      <div>
        <h4>Item1 - - {quantity}</h4>
        <button onClick={()=>setQuantity(quantity+1)}>➕</button>
        <button onClick={()=>setQuantity(quantity-1)}>➖</button>
      </div>
    </div>
  )
}

export default CartItem
