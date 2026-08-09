import React, { useState } from 'react'

const LikeButton = () => {

    const [like, setLike] = useState(0);

  return (
    <div>
        
        <button onClick={()=>{setLike(like+1)}}>❤️</button>
        <h4>{like}</h4>

    </div>
  )
}

export default LikeButton
