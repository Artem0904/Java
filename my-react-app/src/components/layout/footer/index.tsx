// src/components/Footer.tsx
import React from 'react';

const Footer: React.FC = () => {
    return (
        <footer>
            <p>&copy; {new Date().getFullYear()} My App</p>
        </footer>
    );
};

export default Footer;