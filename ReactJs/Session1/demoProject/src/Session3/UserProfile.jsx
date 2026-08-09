import React from 'react'

const UserProfile = ({user= { username: 'Guest',img:'', followers: 0 }}) => {
  return (
    <div>
        <h2>{user.username}</h2>
      <img 
        src={user.img}
      />
      <h4>{user.followers}</h4>

    </div>
  )
}

export default UserProfile
