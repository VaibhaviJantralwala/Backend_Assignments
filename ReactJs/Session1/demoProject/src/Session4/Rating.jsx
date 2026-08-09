import React, { useState } from 'react'

const Rating = () => {

    const [rating, setRating] = useState(0);

  return (
    <div>

        <h2>Rate our skills pleasee ! </h2>
        
        {
        [1, 2, 3, 4, 5].map(
            (star) => ( 
            <span key={star} 
                onClick={() => setRating(star)} 
                style={{ fontSize: '40px', cursor: 'pointer', color: star <= rating ? 'gold' : 'gray' }} > 
                ★ 
                </span> 
            )
        )
        } 
        
        <p>Selected Rating: {rating}</p>
      
    </div>
  )
}

export default Rating
