import React, { useState } from 'react'

const SongVote = () => {

    const [count, setCount] = useState(0);

  return (
    <div>
        <h3>🎶{count}</h3>
      <button onClick={()=>{setCount(count+1)}}>Vote!!</button>
      <button onClick={()=>{
        if( count > 0 ){
            setCount(count-1);
        }
        }
        }>Maybe not!</button>
    </div>
  )
}

export default SongVote
