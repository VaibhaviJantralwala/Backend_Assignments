import React from 'react'

const TrendingSong = () => {
  return (
    <div>
      <h2>Trending on Spotify: Calm Down</h2>

      <h3>Explain in your own words (3-4 lines) how React's Virtual DOM makes updating the UI faster compared to traditional DOM manipulation.</h3>
      <p>React uses a Virtual DOM, which is a lightweight copy of the real DOM. When data changes, React first updates the Virtual DOM and compares it with the previous version. It then changes only the parts that actually changed in the real DOM. This reduces unnecessary updates and makes the UI faster than traditional DOM manipulation.</p>
    </div>
  )
}

export default TrendingSong
