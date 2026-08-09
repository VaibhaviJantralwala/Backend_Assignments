import React from 'react'
import PropTypes from 'prop-types'

const ProjectCard = ({product}) => {
  return (
    <div>
      <h3>{product.name}</h3>
      <h3>{product.price}</h3>
    </div>
  )
}

ProjectCard.propTypes = {
  product : PropTypes.shape({
    name : PropTypes.string.isRequired,
    price : PropTypes.number.isRequired
  }).isRequired
}

export default ProjectCard
